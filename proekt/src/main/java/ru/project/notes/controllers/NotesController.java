package ru.project.notes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.project.notes.dao.WebNoteDAO;
import ru.project.notes.models.WebNote;

@Controller
@RequestMapping("/notes")
public class NotesController {
	
	private final WebNoteDAO webNoteDAO;
	
	public NotesController(WebNoteDAO webNoteDAO) {
		 this.webNoteDAO = webNoteDAO;
	}
	
	@GetMapping()
	public String index(Model model) {
		model.addAttribute("notes", webNoteDAO.index());
		return "notex/index";
	}
	@GetMapping("/{id}")
	public String show(@PathVariable("id") int id,Model model) {
		model.addAttribute("note", webNoteDAO.show(id));
		return "notes/show";
	}
	
	@PostMapping()
	public String create(@RequestParam("note") String note,Model model) {
		WebNote webNote = new WebNote();
		webNote.setNote(note);
		return "success Page";
	}
	@GetMapping("/new")
	public String newNote(Model model) {
		model.addAttribute("webNote",new WebNote());
		return "notes/new";
	}
	@PostMapping()
	public String create(@ModelAttribute("WebNote") WebNote webNote) {
		webNoteDAO.save(webNote);
		return "redirect:/notes";
	}
	@GetMapping("/{id}/edit")
	public String edit(Model model,@PathVariable("id") int id) {
		model.addAttribute("WebNote",webNoteDAO.show(id));
		return "notes/edit";
	}
	@PatchMapping("/{id}")
	public String update(@ModelAttribute("WebNote") WebNote webNote, @PathVariable("id") int id) {
		webNoteDAO.update(id,webNote);
		return "redirect/notes";
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") int id) {
		webNoteDAO.delete(id);
		return "redirect:/notes";
	}

}

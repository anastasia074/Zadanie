package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {
    //источник данных каталога
    public abstract ArrayList<Product> getCatalog();
}

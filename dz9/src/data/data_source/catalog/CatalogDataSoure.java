package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSoure {
    //источник данных
    public abstract ArrayList<Product> getCatalog();
}

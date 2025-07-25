package in.cdac.project.billingsoftware.service;

import in.cdac.project.billingsoftware.io.CategoryRequest;
import in.cdac.project.billingsoftware.io.CategoryResponse;

import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request);

    List<CategoryResponse> read();

}
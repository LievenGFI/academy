package be.gfi.academy.dao;

import java.util.List;

@FunctionalInterface
public interface AcademyDAO {

	List<String> listMessages();
}

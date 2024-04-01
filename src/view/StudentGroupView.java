package view;

import java.util.logging.Logger;

import data.StudentGroup;

public class StudentGroupView {

	Logger logger = Logger.getLogger(StudentGroupView.class.getName());

	public void sendOnConsole(StudentGroup studentGroup) {
		logger.info(studentGroup.toString());
	}
}

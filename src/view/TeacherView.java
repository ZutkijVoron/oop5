package view;

import data.Teacher;
import data.TeacherGroup;
import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {
	Logger logger = Logger.getLogger(TeacherView.class.getName());

	@Override
	public void sendOnConsole(List<Teacher> teachers) {
		for (Teacher teacher : teachers) {
			logger.info(teacher.toString());
		}
	}

	public void sendOnConsoleTeacherGroup(TeacherGroup teacherGroup) {
		logger.info(teacherGroup.toString());
	}
}

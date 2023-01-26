import model.attandance.AttendanceGroup;
import model.attandance.AttendanceVisitStudent;
import model.students.Student;
import model.students.StudentGroup;
import presenter.Presenter;
import view.controller.*;

public class Main
{
    public static void main(String[] args)
    {
        Student Jon = new Student("Андрей", 1);
        Student Sara = new Student("Антон", 1);
        Student Bill = new Student("Анна", 1);

        StudentGroup studentGroupOneCourse = new StudentGroup();

        studentGroupOneCourse.addStudentInGroup(Jon);
        studentGroupOneCourse.addStudentInGroup(Sara);
        studentGroupOneCourse.addStudentInGroup(Bill);

        AttendanceVisitStudent attendanceVisitingJon = new AttendanceVisitStudent(Jon);
        AttendanceVisitStudent attendanceVisitingSara = new AttendanceVisitStudent(Sara);
        AttendanceVisitStudent attendanceVisitingBill = new AttendanceVisitStudent(Bill);

        attendanceVisitingSara.addVisiting("01-01-2023", true);
        attendanceVisitingSara.addVisiting("02-01-2023", true);
        attendanceVisitingSara.addVisiting("03-01-2023", true);
        attendanceVisitingSara.addVisiting("04-01-2023", true);
        attendanceVisitingSara.addVisiting("05-01-2023", true);
        attendanceVisitingSara.addVisiting("06-01-2023", true);
        attendanceVisitingSara.addVisiting("07-01-2023", true);

        attendanceVisitingBill.addVisiting("01-01-2023", false);
        attendanceVisitingBill.addVisiting("02-01-2023", false);
        attendanceVisitingBill.addVisiting("03-01-2023", false);
        attendanceVisitingBill.addVisiting("04-01-2023", false);
        attendanceVisitingBill.addVisiting("05-01-2023", false);
        attendanceVisitingBill.addVisiting("06-01-2023", false);
        attendanceVisitingBill.addVisiting("07-01-2023", true);
        
        attendanceVisitingJon.addVisiting("01-01-2023", true);
        attendanceVisitingJon.addVisiting("02-01-2023", false);
        attendanceVisitingJon.addVisiting("03-01-2023", true);
        attendanceVisitingJon.addVisiting("04-01-2023", true);
        attendanceVisitingJon.addVisiting("05-01-2023", true);
        attendanceVisitingJon.addVisiting("06-01-2023", false);
        attendanceVisitingJon.addVisiting("07-01-2023", true);

        AttendanceGroup attendanceGroupOneCourse = new AttendanceGroup();

        attendanceGroupOneCourse.addAttendanceVisit(attendanceVisitingJon);
        attendanceGroupOneCourse.addAttendanceVisit(attendanceVisitingBill);
        attendanceGroupOneCourse.addAttendanceVisit(attendanceVisitingSara);

        ControllerAttendanceGroup controllerGroup = new ControllerAttendanceGroup(attendanceGroupOneCourse);

        Presenter presenter = new Presenter(controllerGroup, studentGroupOneCourse);
        presenter.button_start_all_command();
    }
}
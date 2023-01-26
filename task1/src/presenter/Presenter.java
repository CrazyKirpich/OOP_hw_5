package presenter;

import model.students.StudentGroup;
import view.controller.ControllerAttendanceGroup;

public class Presenter
{
    private ControllerAttendanceGroup view;
    private StudentGroup model;
    
    public Presenter(ControllerAttendanceGroup view, StudentGroup model)
    {
        this.view = view;
        this.model = model;
    }

    public void button_start_all_command ()
    {
        view.PrintStudentsVisitingPercent(model);
        view.PrintStudentsVisitingLess25Persent(model);
        view.PrintSortStudentsVisiting(model);
    }
}

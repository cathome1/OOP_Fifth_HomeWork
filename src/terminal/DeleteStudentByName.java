package terminal;

public class DeleteStudentByName implements CommandExecutable{
    private StudentService studentService;
    private Student student;
    private StudentGroup studentGroup;

    public DeleteStudentByName(StudentService studentService, Student student, StudentGroup studentGroup) {
        this.studentService = studentService;
        this.student = student;
        this.studentGroup = studentGroup;
    }

    @Override
    public void execute() {
        studentService.deleteByName(studentGroup,student.getName()); // в СтудентСервис есть метод, принимающий на входе СтудентГруп и Стринг. Метод проходит по именам в листе сдунетвов, при совпадении выводит студента на экран и удаляет.
    }
}

package terminal;

public class DeleteStudentByGroupNumberAndAge implements CommandExecutable{
    private StudentService studentService;
    private Student student;
    private StudentGroup studentGroup;
    private GroupStream groupStream;

    public DeleteStudentByGroupNumberAndAge(StudentService studentService, Student student, StudentGroup studentGroup, GroupStream groupStream) {
        this.studentService = studentService;
        this.student = student;
        this.studentGroup = studentGroup;
        this.groupStream = groupStream;
    }

    @Override
    public void execute() {
        studentService.deleteByGrNumAndAge(groupStream,studentGroup.getGroupNumber(),student.getAge());
//в СтудентСервис есть метод, принимающий на входе ГрупСтрим и 2 инта. циклом находится группа/ы с нужным groupNumber и в найденой группе циклом находятся ученики с возрастом как в 3ей переданной переменной, выводятся на экран и удаляются.
    }
}

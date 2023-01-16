package terminal;

public class CommandExecutableFactory {
    private StudentService studentervice;
    private GroupStreamService groupStreamService;

    public CommandExecutableFactory(StudentService studentervice, GroupStreamService groupStreamService) {
        this.studentervice = studentervice;
        this.groupStreamService = groupStreamService;
    }


    public CommandExecutable create(String[] input){
        if (input[0].equals("/add")){
            return CreateStudentExecutable(studentervice, new Student(input[1])); // имя студента
    }
        if (input[0].equals("/delete"){
            return DeleteStudentExecutable(studentervice, new Student(input[1]));
        }
        if (input[0].equals("/delete") && input[1].equals("--name")){
            return DeleteStudentByName(groupStreamService.getGroupByNumber(input[3]), new Student(input[2]));//ожидается номер группы
        }
        if (input[0].equals("/delete") && input[1].equals("--group")&& input[3].equals("--age")){
            return DeleteStudentByGroupNumberAndAge(groupStreamService.getGroupByNumber(input[2]), Integer.valueOf(input[4]));
        }
}

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        University uni = new University();

        Faculty csFaculty = new Faculty("Факультет информационных технологий");
        Dean dean = new Dean(101, "Петр Иванов", "petr.ivanov@uni.edu");
        csFaculty.assignDean(dean);

        Institute itInstitute = new Institute("Институт искусственного интеллекта", "пр. Науки, 15");
        csFaculty.addDepartment(itInstitute);
        uni.addFaculty(csFaculty);

        Lecturer lecturer1 = new Lecturer(201, "Мария Козлова", "maria.kozlova@uni.edu", "Машинное обучение");
        Lecturer lecturer2 = new Lecturer(202, "Алексей Соколов", "alexey.sokolov@uni.edu", "Большие данные");

        itInstitute.addResearch(lecturer1);
        itInstitute.addResearch(lecturer2);

        Course aiCourse = new Course(1, "Основы машинного обучения", 4);
        aiCourse.addLecturer(lecturer1);

        Project project = new Project("Анализ медицинских данных", LocalDate.of(2025, 2, 1), LocalDate.of(2025, 11, 30));
        project.addParticipation(new Participation(lecturer1, 120));
        project.addParticipation(new Participation(lecturer2, 80));

        System.out.println("УНИВЕРСИТЕТ");
        System.out.println(uni);
        System.out.println(csFaculty);
        System.out.println(itInstitute);
        System.out.println("\nКурс: " + aiCourse);
        System.out.println("Преподаватели курса:");
        aiCourse.getLecturers().forEach(System.out::println);

        System.out.println("\nПроект: " + project);
        System.out.println("Участники проекта:");
        project.addParticipation(new Participation(lecturer1, 100));
        System.out.println("Добавлено участие преподавателя: " + lecturer1.getName());
    }
}
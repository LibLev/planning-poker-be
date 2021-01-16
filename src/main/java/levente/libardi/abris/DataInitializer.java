package levente.libardi.abris;

import levente.libardi.abris.model.Task;
import levente.libardi.abris.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private TaskRepository tasks;


    public DataInitializer(TaskRepository tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run(String... args) {
        Task task1 = Task.builder()
                .nameOfTask("Login")
                .description("Create a login page with two input field and a Login button")
                .build();

        Task task2 = Task.builder()
                .nameOfTask("Sign up")
                .description("Create a sign up page with two input field and a Sign up button")
                .build();

        Task task3 = Task.builder()
                .nameOfTask("Main page")
                .description("Create a Main page where the users can share their questions")
                .build();

        Task task4 = Task.builder()
                .nameOfTask("Question page")
                .description("Create a question page where you can see all the details of the question and if you want you can answer it")
                .build();

        Task task5 = Task.builder()
                .nameOfTask("Profile page")
                .description("Here you can see your profile data and all your questions and answers")
                .build();

        Task task6 = Task.builder()
                .nameOfTask("Like&Dislike")
                .description("The user can like or dislike the answers")
                .build();

        tasks.save(task1);
        tasks.save(task2);
        tasks.save(task3);
        tasks.save(task4);
        tasks.save(task5);
        tasks.save(task6);

    }
}

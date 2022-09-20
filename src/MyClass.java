import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class MyClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Hello world!!!");
        goToTrash().get();

    }
    public static CompletableFuture<Void> goToTrash() {
        return CompletableFuture.runAsync(
                () -> {
                    System.out.println("Сын: Мам/Пам, я пошел выносить мусор");
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Сын: Мам/Пап, я вернулся!");
                }
        );
    }
}

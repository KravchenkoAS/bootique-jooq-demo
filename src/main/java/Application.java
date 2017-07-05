import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.BQCoreModule;
import io.bootique.Bootique;

public class Application implements Module {

    public static void main(String[] args) {
        Bootique.app(args)
                .module(Application.class)
                .autoLoadModules()
                .run();
    }

    @Override
    public void configure(Binder binder) {
        BQCoreModule.extend(binder).addCommand(DemoCommand.class);
    }
}

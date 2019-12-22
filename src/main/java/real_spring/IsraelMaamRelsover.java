package real_spring;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class IsraelMaamRelsover implements MaamRelsover {

    private double maam;

    @PostConstruct
    public void init(){
        maam = getMaamFromServer();
    }

    @SneakyThrows
    private double getMaamFromServer() {
        Thread.sleep(3000);
        return 0.17;
    }

    @Override
    public double getMaam() {
        return maam;
    }
}

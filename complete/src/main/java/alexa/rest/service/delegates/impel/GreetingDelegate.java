package alexa.rest.service.delegates.impel;

import alexa.rest.service.delegates.interfaces.IGreetingDelegate;

public class GreetingDelegate implements IGreetingDelegate {

    private final long id;
    private final String content;
    
    

    public GreetingDelegate(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

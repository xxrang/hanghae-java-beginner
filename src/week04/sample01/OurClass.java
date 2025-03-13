package week04.sample01;

public class OurClass {
    private final boolean just = true;

    // throws
    public void thisMethodIsDangerous () throws OurBadException {
        if (just) {
            throw new OurBadException();
        }
    }
}

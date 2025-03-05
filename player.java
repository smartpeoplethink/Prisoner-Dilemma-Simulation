public interface player {
    String description();
    default void result(boolean opponent){

    }
    boolean play();

}

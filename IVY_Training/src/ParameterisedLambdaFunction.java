interface actionable{
    public String action(String a);
}

public class ParameterisedLambdaFunction {
    public static void main(String[] args) {
        actionable action1=(action)->{
            return "Please take the action: "+action;
        };
        System.out.println(action1.action("RUN"));

        actionable action2=action->{
            return "Take the action: "+action;
        };
        System.out.println(action2.action("SWIM"));
    }
}

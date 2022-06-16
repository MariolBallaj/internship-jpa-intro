package util;

public final class Queries {

    private Queries() {}

    public static final String FIND_ALL_EMPLOYEES = "SELECT e FROM Employee e";

    public static final String FIND_EMPLOYEE_BY_FIRST_NAME_METHOD_1 = "SELECT e FROM Employee e WHERE e.firstName = ?1";

    public static final String FIND_EMPLOYEE_BY_FIRST_NAME_METHOD_2 = "SELECT e FROM Employee e WHERE e.firstName = :firstName";

}

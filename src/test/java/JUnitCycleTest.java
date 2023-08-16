import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll
    static void beforeAll() {                            //static, public 차이 -> static은 한 번만 호출될 때, 테스트 주기에 한 번만 실행 될 때, public은 각 인스턴스에 대해 메서드를
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }

}
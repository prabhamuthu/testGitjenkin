
import org.junit.Assert;
import org.junit.Test;

    public class TestJenkin {

        @Test
        public void Testfirst(){
            System.out.println("The first test");
        }

        @Test
        public void TestSecond(){
            System.out.println("The Second test");
        }
        @Test
        public void Testassert(){
            int sum =10;
            Assert.assertEquals(10,sum);

        }
    }


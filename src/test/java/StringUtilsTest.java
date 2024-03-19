import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {

    @Test
    public void testStringUtilsRemove() {
        Assert.assertEquals(StringUtils.remove("Hello", "o"), "Hell");
        Assert.assertEquals(StringUtils.remove("", "o"), "");
    }

    @Test
    public void testStringUtilsRemoveEmpty() {
        Assert.assertEquals(StringUtils.remove("paradise", ""), "paradise");
    }
}

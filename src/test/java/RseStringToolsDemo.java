import io.github.it_is_final.rse_string_tools.Language;
import io.github.it_is_final.rse_string_tools.Version;
import io.github.it_is_final.rse_string_tools.RseStringTools;

public final class RseStringToolsDemo {
    public static void main(String[] args) {
        byte[] inputData = {(byte)0x10, (byte)0xFF, (byte)0x2F, (byte)0xE1};
        String test = RseStringTools.getRseString(
                inputData,
                Version.E,
                Language.JAPANESE
        );
        System.out.println(test.replace('\0', '␃'));

        byte[] decodeTest = RseStringTools.getRseBytes(
                test,
                Version.E,
                Language.JAPANESE
                );
        for (byte b : decodeTest) {
            System.out.printf("%x%n", b);
        }
    }
}
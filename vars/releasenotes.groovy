import java.text.SimpleDateFormat
import java.util;

@NonCPS

    def now = new Date();
    def fmt = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    echo "Date and Time IS: " + fmt.format(date);

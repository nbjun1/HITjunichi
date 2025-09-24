package logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {

	// コンストラクタ
	public CurrentTime() {
	}
	// 日時の取得とフォーマット
	public String getTime() {
		// 呼び出した時の現在日時を取得
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String date = now.format(dateFormatter);
		String time = now.format(timeFormatter);
		
		return "今の現在日時は" + date + " " + time + "です";
	}

}

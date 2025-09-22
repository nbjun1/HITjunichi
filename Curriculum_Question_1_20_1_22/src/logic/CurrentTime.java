package logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
	//　フィールド
	private LocalDateTime now;
	// コンストラクタ
	public CurrentTime() {
		this.now = LocalDateTime.now();
	}
	// 日時の取得とフォーマット
	public String getTime() {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String date = now.format(dateFormatter);
		String time = now.format(timeFormatter);
		
		return "今の現在日時は" + date + " " + time;
	}

}

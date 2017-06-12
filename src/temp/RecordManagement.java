package temp;

import java.util.ArrayList;
import java.util.List;

public class RecordManagement {
	List<Record> rList = new ArrayList<>();

	void tryExchange(Record earlyOne, Record lateOne) {
		for (int i = rList.size() - 1; i != 0; ++i) {

		}
	}
}

class Record {
	Bus leaveBus;
	Bus takeOutBus;
	int leftLastEnd;
}

class Bus {
	int departureTime;
	int availableTime;
	int toGroundTime;
}
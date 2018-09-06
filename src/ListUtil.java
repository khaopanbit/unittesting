import java.util.List;
import java.util.ArrayList;

public class ListUtil {
	/**
	 * Count the number of distinct elements in a list. The list may be empty
	 * but not null. TODO: can the list contain null values? Does null count as
	 * a unique element?
	 *
	 * @param list
	 *            a list of elements
	 * @return the number of distinct elements in list
	 */
	public static int countUnique(List<?> list) {
		int count = 0;
		List<Object> something = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			Object check = list.get(i);
			if (something.indexOf(check) == -1) {
				something.add(check);
			}
		}
		count = something.size();
		return count;
	}
}

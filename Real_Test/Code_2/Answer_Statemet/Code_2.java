
import java.util.*;
class Code_2
{

static int minCntCharDeletionsfrequency(char[] str,int N)
{

HashMap<Character,
		Integer> mp =
		new HashMap<>();


PriorityQueue<Integer> pq =
		new PriorityQueue<>((x, y) ->
		Integer.compare(y, x));

int cntChar = 0;

for (int i = 0; i < N; i++)
{
	if(mp.containsKey(str[i]))
	{
	mp.put(str[i],
	mp.get(str[i]) + 1);
	}
	else
	{
	mp.put(str[i], 1);
	}
}

for (Map.Entry<Character,
				Integer> it :
				mp.entrySet())
{

	pq.add(it.getValue());
}

while (!pq.isEmpty())
{

	int frequent = pq.peek();

	pq.remove();

	if (pq.isEmpty()) {

	return cntChar;
	}

	if (frequent == pq.peek())
	{

	if (frequent > 1)
	{

		pq.add(frequent - 1);
	}

	cntChar++;
	}
}

return cntChar;
}

public static void main(String[] args)
{
String str = "abbbcccd";

int N = str.length();
System.out.print(minCntCharDeletionsfrequency(
		str.toCharArray(), N));
}
}


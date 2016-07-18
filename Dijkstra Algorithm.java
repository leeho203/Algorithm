import java.util.*;

public class Main {

	static int[] dist;
	static int[][] adj;
	static int V;
	static int E;
	static final int INF = 987654321;

	static class Element implements Comparable<Element> {
		int index;
		int distance;

		Element(int index, int distance) {
			this.index = index;
			this.distance = distance;
		}

		public int getIndex() {
			return index;
		}

		public int getDistance() {
			return distance;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public void setDistance(int distance) {
			this.distance = distance;
		}

		public int compareTo(Element o) {
			return (distance <= o.distance) ? -1 : 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		int start = sc.nextInt();

		dist = new int[V + 1];
		adj = new int[V + 1][V + 1];

		for (int i = 0; i <= V; i++)
			dist[i] = INF;

		for (int i = 0; i <= V; i++)
			for (int j = 0; j <= V; j++)
				adj[i][j] = INF;

		for (int i = 1; i <= E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			if (w < adj[u][v])
				adj[u][v] = w;
		}

		dijkstra(start);
		for (int i = 1; i <= V; i++)
			System.out.print(((dist[i] < INF) ? dist[i] : "INF") + "\n");

	}

	// 다익스트라 알고리즘은 너비우선탐색을 시행하되 큐 대신 우선순위 큐를 쓴다는 점에서 다름
	static void dijkstra(int start) {
		PriorityQueue<Element> que = new PriorityQueue<Element>();
		dist[start] = 0;
		que.offer(new Element(start, dist[start]));

		while (!que.isEmpty()) {
			int here = que.peek().getIndex();
			int cost = que.peek().getDistance();
			que.poll();

			if (cost > dist[here])
				continue;

			// there과 연결되어 있고 there로 가는 더 짧은 경로가 존재한다면 최단경로를 바꿔줌
			for (int there = 1; there <= V; there++) {
				if (adj[here][there] != 0 && dist[there] > dist[here] + adj[here][there]) {
					dist[there] = dist[here] + adj[here][there];
					que.offer(new Element(there, dist[there]));
				}
			}
		}
	}
}

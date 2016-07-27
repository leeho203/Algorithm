class FenwickTree {
		ArrayList<Long> list = new ArrayList<Long>();

		// 팬윅트리 초기화
		FenwickTree() {
			for (int i = 0; i <= n; i++)
				list.add((long) 0);
		}

		// 팬윅트리 구간합
		public long sum(int pos) {
			long result = 0;
			while (pos > 0) {
				result += list.get(pos);
				pos -= (pos & -pos);
			}
			return result;
		}

		// 팬윅트리 갱신
		public void update(int pos, long diff) {
			while (pos < list.size()) {
				list.set(pos, list.get(pos) + diff);
				pos += (pos & -pos);
			}
		}
}

package les17;

public class Collection {
	private static Number[] arr;
	
	public Collection() { }
	
	public Collection(Number[] arr) {
		Collection.arr = arr;
	}
	
	private class Forward implements Iterator {
		
		private int position = 0;
		
		@Override
		public boolean hasNext() {
			return position < arr.length;
		}

		@Override
		public void next() {
			if (position % 2 == 0)
				System.out.print(arr[position++] + ", ");
			else {
				System.out.print(0 + ", ");
				position++;
			}
		}
	}
	
	private class Backward implements Iterator {
		
		private int position = (arr.length - 1);
		
		@Override
		public boolean hasNext() {
			return position >= 0;
		}

		@Override
		public void next() {
			System.out.print(arr[position] + ", ");
			position-=2;
		}
		
	}
	
	public Iterator anonym() {
		return new Iterator() {
			private int position = (arr.length - 1);
			
			@Override
			public boolean hasNext() {
				return position >= 0;
			}

			@Override
			public void next() {
				if(arr[position].doubleValue() % 2 != 0)	
					System.out.print(arr[position] + ", ");
				position-=3;
			}
		};
	}
	
	public Iterator local() {
		class LocalIterator implements Iterator {
			
			private int position = 0;
			
			@Override
			public boolean hasNext() {
				return position < arr.length;
			}

			@Override
			public void next() {
				if ((position+1) % 5 == 0 && arr[position].doubleValue() % 2 == 0) {
					System.out.print(arr[position].doubleValue()-100 + ", ");
					position++;
				}
				else
					System.out.print(arr[position++] + ", ");
			}
			
		}
		return new LocalIterator();
	}
	
	private static class StaticIterator implements Iterator {
		
		private int position = 0;
		
		@Override
		public boolean hasNext() {
			return position < arr.length;
		}

		@Override
		public void next() {
			if (arr[position].doubleValue() % 2 == 0)
				System.out.print(arr[position].doubleValue() - 1 + ", ");
			position += 2;
		}
		
	}
	
	public Forward createForward() {
		return new Forward();
	}
	
	public Backward createBackward() {
		return new Backward();
	}
	
	public static Iterator staticIterator() {
		return new StaticIterator();
	}
	
}

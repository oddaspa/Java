package interfaces;

import java.util.Iterator;
import java.util.function.BinaryOperator;

public class BinaryComputingIterator implements Iterator<Double>{
	Iterator<Double> iterator1;
	Iterator<Double> iterator2;
	BinaryOperator<Double> operator;
	Double default1;
	Double default2;
	
	public BinaryComputingIterator(Iterator<Double> iterator1,Iterator<Double> iterator2, Double default1, Double default2, BinaryOperator<Double> operator){
		this.default1=default1;
		this.default2=default2;
		this.operator=operator;
		this.iterator1=iterator1;
		this.iterator2=iterator2;
	}
	BinaryComputingIterator(Iterator<Double> iterator1, Iterator<Double> iterator2, BinaryOperator<Double> operator){
		this.operator=operator;
		this.iterator1=iterator1;
		this.iterator2=iterator2;
	}
	
	
	@Override
	public boolean hasNext() {
		if(iterator1.hasNext()&&iterator2.hasNext()){
			return true;
		}
		if(!iterator1.hasNext()&&!iterator2.hasNext()){
			return false;
		}
		if(!iterator1.hasNext()&&!(default1==null)){
			return true;
		}
		if(!iterator2.hasNext()&&!(default2==null)){
			return true;
		}
		return false;
	}

	@Override
	public Double next() {
		if(iterator1.hasNext()&&iterator2.hasNext()){
			return operator.apply(iterator1.next(),iterator2.next());
		}else if(iterator1.hasNext()){
			return operator.apply(iterator1.next(),default2);
		}else{
			return operator.apply(default1, iterator2.next());
			
		}

	}
}
package org.aksw.sante.core;
public class WeightedObjet <O> {
		private O key; 
		private double weight;
		
		public WeightedObjet(O key, double weight) {
			this.setKey(key);
			this.setWeight(weight);
		}
		
		public O getKey() {
			return key;
		}
		
		public void setKey(O key) {
			this.key = key;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
	}
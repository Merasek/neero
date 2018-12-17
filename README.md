# Computational Modeling of Cognitive Activity in the Human Brain
## class assignment
### Simulation of Simplified Discretized Leaky Integrate and Fire Neuron
#### Part 1:
a.	we built a function that represents a bucket filled with water using one  tap that gives equal spikes each time it works. The bucket has max capacity it can contain and a leak . every time the bucket is full and we are trying to fill it even more we will spill all its contents. At the end of the time we provided for the bucket to be filled we will get the number of times the bucket got over filled.

b.	Similarly to the function above we built a bucket that filled with water using two taps that give equal spikes each time they work. The leak now is 1 to 50 at a ratio of the spikes. We can see that the bucket will be filled much faster than the first one given the same time and same bucket capacity. 

c.	If the first tap will give spikes of 5 per sec' while the second tap gives spikes of 3 per sec'  to the same bucket , it will be filled 3 times faster than the usual spikes .
#### Part 2:
a.	We built a function that represents a matrix of neurons I and J while I stands for input and J stands for output. We fill the matrix randomly and then examine it. If the weight is 0 then there was no connection , if the weight is 1 the connection was positive and is called "Excitatory", if the weight was -1 the connection was negative and is called "Inhibitory".  At the end we will count how many time there was connection, of what type and if there was connection at all.

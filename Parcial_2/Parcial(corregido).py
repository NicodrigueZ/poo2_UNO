import networkx as nx
import matplotlib.pyplot as plt

class parcial:
    
    def __init__(self):
     self.camino=[]
     self.peso=0
     self.grafo = nx.Graph() 
     self.calleparacambiar=[]
     self.esquina = ["1","2","3","4","5","6","7","8"]
     self.escuela = "7"
     self.colectivo ="2"
     self.calles = [("2","4",4),("2","1",5),("2","3",2),("3","1",3),
                    ("4","1",4),("7","5",3),("1","5",3),("1","6",7),
                    ("8","4",2),
                    ("6","8",1),("8","7",6),("6","7",8),("5","3",2)]
     
    def caminominimo(self):
       self.grafo.add_nodes_from(self.esquina)
       self.grafo.add_weighted_edges_from(self.calles)
       self.camino = nx.dijkstra_path(self.grafo, self.colectivo, self.escuela)
       self.peso=nx.dijkstra_path_length(self.grafo, self.colectivo, self.escuela)
       print(self.camino)
       nx.draw(self.grafo, pos=nx.circular_layout(self.grafo),node_size=650, node_color = '#ffff8f', edge_color='black', with_labels=True)   
       plt.show()
       
       
    def callesparacambiar(self):
       contador = len(self.camino)
       numeroCalle=1
       for i in self.calles:
            recorridoEsquinasCalle = [i[1],i[0]]
            for j in range(1,contador):
                recorridoEsquinasDijkstra = [self.camino[j-1],self.camino[j]]
                if recorridoEsquinasDijkstra == recorridoEsquinasCalle:
                    self.calleparacambiar.append(numeroCalle)
            numeroCalle+=1

obj = parcial() 
obj.caminominimo()
obj.callesparacambiar()
print("Calles a cambiar: ",obj.calleparacambiar)   

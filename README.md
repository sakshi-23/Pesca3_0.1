# Pesca3_0.1
Pesca for Cytoscsape ( GSOC )


The Pesca App can be basically used to find the shortest paths and trees in any given graph- directed or undirected or even weighted. Further it incorporates algorithms to find all nodes shortest paths, multiple shortest paths between nodes, SP clusters, connect a node to a subnetwork in the graph. The features include results regarding the connectivity of a graph, average path length, shortest path distribution graph and the ability to highlight certain paths from the results.

Control panel features
From the control panel any of the following options can be selected to give the corresponding results.
1.	Multi-Shortest Paths trees
This feature is used to find all the paths from any given node. 
Usage: Select 1 node and on clicking start, the result panel will have the corresponding paths. Further the result panel also contains information regarding the expected and actual unique paths and also if the graph is connected
2.	Multi-Shortest Paths 
This feature is used to find all the shortest paths between any 2 nodes. 
Usage: Select 2 nodes and on clicking start, the result panel will have the corresponding paths
3.	All nodes Shortest Paths 
This feature is used to find the shortest paths from the nodes to every other node in the graph. 
Usage: Click start, the result panel will have the corresponding paths.
 Further the result panel also contains information regarding the expected and actual unique paths and also if the graph is connected
4.	SP Cluster
This feature is used to find the shortest paths in a given cluster of joint of disjoined nodes. 
Usage: Any number of nodes can be selected and on clicking start, the result panel will have the corresponding paths between the selected group of nodes. 
5.	Connect isolated nodes
This feature is used to find the shortest paths between a subnetwork of the given graph and an isolated node in the graph not part of the subnetwork 
Usage: Select the isolated node and click start, then select the subnetwork and click on start again, the result panel will have the corresponding shortest paths between the selected group of nodes and the node initially selected. 


Additional Parameters in the Control Panel

Help buttons: These correspond to their respective features and give a description on the parameters
Directed Checkbox: If checked, this will ensure that only directed paths would be calculated
Weighted Checkbox: If checked, this will prompt to specify the column for edge weights calculation. The column should already exist in the edge table and be of number type. 
Select network: The user can select among the networks and sessions in the dropdown and the corresponding network or session will be loaded. These networks have been extracted from ____. This feature requires an internet connection to work.


Result panel features
The result panel has the following features
Paths tables
This has columns namely: Shortest path, Target node, Size for the option selected and calculated in the Control Panel ( eg. Multi Shortest Paths)
SP distribution table
This has columns namely Size and number of Sp(Shortest Paths)
Connectivity Table
 This has the following calculated parameters: 
Average Path Length- represents the Average of all the paths in the paths table. If 2 paths exist between a given set of nodes,only 1 path is taken under consideration for calculation. 
Unique S->T (Source to Target) Paths: This gives the total count of paths calculated for every unique combination of source and target
Expected Paths: This gives the total count of paths that would be expected for every unique combination of source and target in the calculation. This parameter is only calculated in case of finding All Nodes Shortest Path and Multi Source Shortest Path Tree.
Connectivity: True or false based on if the graph is connected or not. In case of directed, it needs to be strongly connected. This parameter is only calculated in case of finding All Nodes Shortest Path and Multi Shortest Path Tree

View selected paths
 You can select any nodes from the given graph. On clicking the button, All the rows in the table that start or end with the given nodes will be highlighted
View SP graph
This gives a distribution graph containing the path length and the number of such paths in the graph for the given calculation.
Select
 You can select any row in the table, click select and it will highlight the corresponding path in the graph view
Order by name
 This button will sort the paths table according to the Target Node.
Order by Size
 This button will sort the paths according to the Size

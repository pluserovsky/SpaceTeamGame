G:
cd G:\Lukasz\Desktop\PWR\semestr_6\java\netbans\SpaceTeamGame\build\classes\
start rmiregistry
cd ..
cd ..
timeout 5
java -cp build/classes  -Djava.security.policy=client.policy -Djava.rmi.server.codebase=file:/G:/Lukasz/Desktop/PWR/semestr_6/java/netbans/SpaceTeamGame/build/classes server.ServerMain
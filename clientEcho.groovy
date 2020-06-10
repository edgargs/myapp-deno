def socket = new Socket('localhost', 8080)
println "Connected succesfully"

Scanner console = new Scanner(System.in);

socket.withStreams { input, output ->

	while (console.hasNextLine()) {
		lineNew = console.nextLine();
		
		if (lineNew.isEmpty()) {
			println "Good bye"
			break;
		}
		
		println "Client: $lineNew"
		output << lineNew+"\n"
		println "Server: "+input.newReader().readLine()
	}	
}


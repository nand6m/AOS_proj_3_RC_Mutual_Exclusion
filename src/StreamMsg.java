import java.io.Serializable;
//import java.util.ArrayList;

enum MsgType{initiate,terminate,neighbor,okay,PACK,NACK,parentRequest,broadcast,convergeCast_ack,broadcast_terminate,request,grant,req_grant,initiateApplication,metricReport,get_i,set_i,done_i};
public class StreamMsg implements Serializable {
	private static final long serialVersionUID = 1L;
	int sourceNodeId;
	int immediateSourceNodeId;
	long timestamp;
	MsgType type;
	String message;

	public StreamMsg(){
		sourceNodeId = -1;
		immediateSourceNodeId = -1;
		timestamp = -1;
		type = MsgType.okay;
		message = " ";
	}
}

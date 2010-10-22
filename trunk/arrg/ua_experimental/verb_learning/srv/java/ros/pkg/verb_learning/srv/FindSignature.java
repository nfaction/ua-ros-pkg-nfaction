/* auto-generated by gensrv_java from /home/dhewlett/ros/ua-ros-pkg/ua_experimental/verb_learning/srv/FindSignature.srv.  Do not edit! */
package ros.pkg.verb_learning.srv;

import java.nio.ByteBuffer;

public class FindSignature extends ros.communication.Service<FindSignature.Request, FindSignature.Response> 
{

public static String __s_getDataType() { return "verb_learning/FindSignature"; }
public static String __s_getMD5Sum() { return "3c282a866fa3031cf1d4de457a3b82cf"; }

public String getDataType() { return FindSignature.__s_getDataType(); }
public String getMD5Sum() { return FindSignature.__s_getMD5Sum(); }

public static class Request extends ros.communication.Message
{

  public ros.pkg.verb_learning.msg.VerbDescription verb;
  public ros.pkg.time_series.msg.Episode[] episodes;

  public Request() {
 super();
    verb = new ros.pkg.verb_learning.msg.VerbDescription();
  episodes = new ros.pkg.time_series.msg.Episode[0];

  }
  public static java.lang.String __s_getDataType() { return "verb_learning/FindSignatureRequest"; }
  public static java.lang.String __s_getMD5Sum() { return ""; }
  public static java.lang.String __s_getMessageDefinition()
  {
    return 
    "VerbDescription verb\n" + 
    "time_series/Episode[] episodes\n" + 
    "\n" + 
    "";
  }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public java.lang.String getMD5Sum()   { return __s_getMD5Sum(); }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }
  public static java.lang.String __s_getServerMD5Sum() { return ("3c282a866fa3031cf1d4de457a3b82cf"); }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String  __s_getServiceDataType() { return ("verb_learning/FindSignature"); }
  public java.lang.String getServiceDataType() { return __s_getServiceDataType(); }
  public Request clone() {
    Request clone = (Request)super.clone();
      verb = (ros.pkg.verb_learning.msg.VerbDescription)verb.clone();
      episodes =  (ros.pkg.time_series.msg.Episode[])(clone.episodes.clone());
      for (int i = 0; i < episodes.length; i++) episodes[i] = (ros.pkg.time_series.msg.Episode)episodes[i].clone();
    return clone;
  }

  public static java.util.Map<java.lang.String, java.lang.String> fieldTypes() {
         java.util.HashMap<java.lang.String, java.lang.String> m = new java.util.HashMap<java.lang.String, java.lang.String>  ();      m.put("verb", "ros.pkg.verb_learning.msg.VerbDescription");
     m.put("episodes", "ros.pkg.time_series.msg.Episode[]");
     return m;
  }

  public static java.util.Set<java.lang.String> submessageTypes() {
         java.util.HashSet<java.lang.String> s = new java.util.HashSet<java.lang.String>  ();      s.add("ros.pkg.verb_learning.msg.VerbDescription");
     s.add("ros.pkg.time_series.msg.Episode");
     return s;
  }

  public void setTo(ros.communication.Message __m) {
    if (!(__m instanceof Request)) throw new RuntimeException("Invalid Type");
    Request __m2 = (Request) __m;
    verb = __m2.verb;
    episodes = __m2.episodes;
    }

  int calc_episodes_array_serialization_len() {
    int l = 0;
    for (int i = 0; i < episodes.length; i++) 
      l += episodes[i].serializationLength();
    return l;
  }
  public int serializationLength() 
  {
    int __l = 0;
    __l += verb.serializationLength(); // verb
    __l += 4 + calc_episodes_array_serialization_len(); // episodes
    return __l;
  }
  public void serialize(ByteBuffer bb, int seq) {
     verb.serialize(bb, seq);
    bb.putInt(episodes.length);
    for (ros.pkg.time_series.msg.Episode x : episodes)
      x.serialize(bb, seq);
  }
  public void deserialize(ByteBuffer bb)  {
     verb.deserialize(bb);
     int episodes_len = bb.getInt();
    episodes = new ros.pkg.time_series.msg.Episode[episodes_len];
    for(int i = 0; i < episodes_len; i++)
      {episodes[i] = new ros.pkg.time_series.msg.Episode(); episodes[i].deserialize(bb); }
  }
}

public static class Response extends ros.communication.Message
{


  public Response() {
 super();

  }
  public static java.lang.String __s_getDataType() { return "verb_learning/FindSignatureResponse"; }
  public static java.lang.String __s_getMD5Sum() { return ""; }
  public static java.lang.String __s_getMessageDefinition()
  {
    return 
    "================================================================================\n" + 
    "MSG: verb_learning/VerbDescription\n" + 
    "string verb\n" + 
    "string[] arguments\n" + 
    "================================================================================\n" + 
    "MSG: time_series/Episode\n" + 
    "time_series/Interval[] intervals\n" + 
    "================================================================================\n" + 
    "MSG: time_series/Interval\n" + 
    "string proposition\n" + 
    "int32 start\n" + 
    "int32 end\n" + 
    "\n" + 
    "";
  }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public java.lang.String getMD5Sum()   { return __s_getMD5Sum(); }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }
  public static java.lang.String __s_getServerMD5Sum() { return ("3c282a866fa3031cf1d4de457a3b82cf"); }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String  __s_getServiceDataType() { return ("verb_learning/FindSignature"); }
  public java.lang.String getServiceDataType() { return __s_getServiceDataType(); }
  public Response clone() {
    Response clone = (Response)super.clone();
    return clone;
  }

  public static java.util.Map<java.lang.String, java.lang.String> fieldTypes() {
         java.util.HashMap<java.lang.String, java.lang.String> m = new java.util.HashMap<java.lang.String, java.lang.String>  ();      return m;
  }

  public static java.util.Set<java.lang.String> submessageTypes() {
         java.util.HashSet<java.lang.String> s = new java.util.HashSet<java.lang.String>  ();      return s;
  }

  public void setTo(ros.communication.Message __m) {
    if (!(__m instanceof Response)) throw new RuntimeException("Invalid Type");
    Response __m2 = (Response) __m;
    }

  public int serializationLength() 
  {
    int __l = 0;
    return __l;
  }
  public void serialize(ByteBuffer bb, int seq) {
  }
  public void deserialize(ByteBuffer bb)  {
  }
}

public FindSignature.Request createRequest() { return new FindSignature.Request(); }public FindSignature.Response createResponse() { return new FindSignature.Response(); }}


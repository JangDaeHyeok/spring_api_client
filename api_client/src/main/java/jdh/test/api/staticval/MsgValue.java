package jdh.test.api.staticval;

/**
 * @λΆλ₯ : 
 * @?΄??€λͺ? : MsgValue
 * @?΄??€?€λͺ? : λ©μμ§? ??± ?€??± ?΄??€
 */
public class MsgValue {

	public static final String SORRY              = "κ΄?λ¦¬μ? λ¬Έμ ?΄μ£ΌμΈ?.";
	public static final String WRONG_ACCESS       = "?λͺ»λ ? κ·Όμ??€.";
	public static final String SORRY_NO_PAGE      = "?μ²???  ??΄μ§?λ₯? μ°Ύμ? ??΅??€.";
	public static final String SORRY_CALL_ADMIN   = "λΆνΈ? ?? € ???¨? μ£μ‘?©??€. κ΄?λ¦¬μ? λ¬Έμ ?΄μ£ΌμΈ?.";
	public static final String WAIT_TRY_AGAIN     = "λΆνΈ? ?? € ???¨? μ£μ‘?©??€. ? ? ? ?€? ???΄μ£ΌμΈ?.";
	public static final String SORRY_NAME_DEFFI   = "λ³ΈμΈ λͺμ? ?΄???° λ²νΈλ‘? ?Έμ¦ν?€ ? ??΅??€.";
	public static final String SORRY_SEARCH_VALUE = "??? λͺ¨λ ? ? ? κ²?? ?΄μ£ΌμΈ?.";
	public static final String AUTH_NOT_FOUND	  = "κΆν?΄ ??΅??€.";
	
	public static final String SPACE = " ";
	public static final String ENTER = "\n";
	public static final String ENTER_ALERT = "\\n";
	public static final String TAB   = "\t";

	/****************************************************************************" CRUD */
	public static final String NOUN_INSERT = "μΆκ?κ°?";
	public static final String NOUN_UPDATE = "?? ?΄";
	public static final String NOUN_SELECT = "κ²???΄";
	public static final String NOUN_DELETE = "?­? κ°?";
	
	public static final String[] OBJECTS = {"?±κ³?", "?€?¨"};
	public static final String VERB = "????΅??€.";
	public static final String COMPLETE = "?λ£λ??΅??€.";

	/****************************************************************************" EXCEPTION */
	public static final String EXCEPTION = "λ¬Έμ κ°? λ°μ????΅??€.";
	
	/****************************************************************************" LOGIN */
	public static final String LOGIN_COMMON_FAIL     = "λ‘κ·Έ?Έ? ?€?¨????΅??€." + ENTER_ALERT + "?€? ???΄ μ£ΌμΈ?.";
	public static final String LOGIN_FIVE_TIMES_FAIL = "λΉλ?λ²νΈ 5? ?€?¨λ‘? λ‘κ·Έ?Έ?΄ λΆκ??©??€." + ENTER_ALERT + "κ΄?λ¦¬μ?κ²? λ¬Έμ?΄μ£ΌμΈ?.";
	public static final String PW_PATTERN_FAIL = "λΉλ?λ²νΈ ???΄ ??λ¦½λ?€."+ ENTER_ALERT +"?€? ???΄ μ£ΌμΈ?.";
	
	/**=====================================[NAMO]
	 * @λΆλ₯ : 
	 * @λ©μ?λͺ? : getDeleteMsg
	 * @??€?Έ?Ό? : 2020. 7. 23.
	 * @κ°λ°? : ?΄κ°λ??
	 * @λ¦¬ν΄ : 
	 * @λ©μ??€λͺ? : type = "κΈ°λ₯λͺ?" (?:?¬?©?) / success = true / false
	 * ===========================================*/
	public static String getDeleteMsg(String type) {
		return type + SPACE + NOUN_DELETE + SPACE + OBJECTS[0] + SPACE + VERB;
	}
	public static String getDeleteMsg(String type, boolean success) {
		String successTxt = OBJECTS[0];
		if(!success) { successTxt = OBJECTS[1]; }
		return type + SPACE + NOUN_DELETE + SPACE + successTxt + SPACE + VERB;
	}
	
	/**=====================================[NAMO]
	 * @λΆλ₯ : 
	 * @λ©μ?λͺ? : getSelectMsg
	 * @??€?Έ?Ό? : 2020. 7. 23.
	 * @κ°λ°? : ?΄κ°λ??
	 * @λ¦¬ν΄ : 
	 * @λ©μ??€λͺ? : type = "κΈ°λ₯λͺ?" (?:?¬?©?) / success = true / false
	 * ===========================================*/
	public static String getSelectMsg(String type) {
		return type + SPACE + NOUN_SELECT + SPACE + OBJECTS[0] + SPACE + VERB;
	}
	public static String getSelectMsg(String type, boolean success) {
		String successTxt = OBJECTS[0];
		if(!success) { successTxt = OBJECTS[1]; }
		return type + SPACE + NOUN_SELECT + SPACE + successTxt + SPACE + VERB;
	}
	
	/**=====================================[NAMO]
	 * @λΆλ₯ : 
	 * @λ©μ?λͺ? : getUpdateMsg
	 * @??€?Έ?Ό? : 2020. 7. 23.
	 * @κ°λ°? : ?΄κ°λ??
	 * @λ¦¬ν΄ : type ?? ?΄ ?±κ³? ????΅??€.
	 * @λ©μ??€λͺ? : type = "κΈ°λ₯λͺ?" (?:?¬?©?) / success = true / false
	 * ===========================================*/
	public static String getUpdateMsg(String type) {
		return type + SPACE + NOUN_UPDATE + SPACE + OBJECTS[0] + SPACE + VERB;
	}
	public static String getUpdateMsg(String type, boolean success) {
		String successTxt = OBJECTS[0];
		if(!success) { successTxt = OBJECTS[1]; }
		return type + SPACE + NOUN_UPDATE + SPACE + successTxt + SPACE + VERB;
	}
	
	/**=====================================[NAMO]
	 * @λΆλ₯ : 
	 * @λ©μ?λͺ? : getInsertMsg
	 * @??€?Έ?Ό? : 2020. 7. 23.
	 * @κ°λ°? : ?΄κ°λ??
	 * @λ¦¬ν΄ : type ?±λ‘μ΄ ?±κ³? ????΅??€.
	 * @λ©μ??€λͺ? : type = "κΈ°λ₯λͺ?" (?:?¬?©?) / success = true / false
	 * ===========================================*/
	public static String getInsertMsg(String type) {
		return type + SPACE + NOUN_INSERT + SPACE + OBJECTS[0] + SPACE + VERB;
	}
	public static String getInsertMsg(String type, boolean success) {
		String successTxt = OBJECTS[0];
		if(!success) { successTxt = OBJECTS[1]; }
		return type + SPACE + NOUN_INSERT + SPACE + successTxt + SPACE + VERB;
	}
}

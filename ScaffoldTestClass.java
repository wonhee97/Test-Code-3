package com.fasoo.sem.ND;

import com.sparrow.test.util.StringUtil;
import javax.servlet.http.HttpServletRequest;

public class ScaffoldTestClass {
    public String useString(HttpServletRequest request) {
        String s = request.getParameter("tel");
        
        if (StringUtil.isNotBlank(s)) { /* by scaffold, true if s != null && !s.equals("") */
            if (s.startsWith("02")) {
                tel1 = s.substring(0,2);
            } else {
                tel1 = s.substring(0,3);
            }
        }
        
        return tel1;
    }
    
    public String useString2(HttpServletRequest request) {
        String s = request.getParameter("tel");
        
        if (StringUtil.unknownStringCheckingLogic(s)) { /* we don't know about s */
            if (s.startsWith("02")) { /* s maybe null */
                tel1 = s.substring(0,2);
            } else {
                tel1 = s.substring(0,3);
            }
        }
        
        return tel1;
    }
}
package org.haiku.haikudepotserver.dataobjects.auto;

import java.util.Map;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.QueryResult;
import org.apache.cayenne.query.MappedExec;

/**
 * This class was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public class _Captcha {

    public static final String DELETE_EXPIRED_RESPONSES_QUERYNAME = "DeleteExpiredResponses";
    public QueryResult<?> performDeleteExpiredResponses(ObjectContext context, Map<String, ?> parameters) {
        MappedExec query = MappedExec.query(DELETE_EXPIRED_RESPONSES_QUERYNAME).params(parameters);
        return query.execute(context);
    }

}
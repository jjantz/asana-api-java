package net.joelinn.asana.stories;

import net.joelinn.asana.tasks.Task;
import net.joelinn.asana.users.User;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

import java.util.Date;

/**
 * Joe Linn
 * 11/20/13
 */
@JsonRootName("data")
public class Story {
    public long id;

    @JsonProperty("created_at")
    public Date createdAt;

    @JsonProperty("created_by")
    public User createdBy;

    public String text;
    public Task target;
    public String source;
    public String type;
}

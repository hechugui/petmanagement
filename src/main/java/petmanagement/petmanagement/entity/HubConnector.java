package petmanagement.petmanagement.entity;

public class HubConnector {
    private Integer connectorid;

    private String connectorname;

    private String connectorpassword;

    private String connectorphone;

    private String connectoremail;

    private Integer hubid;

    public Integer getConnectorid() {
        return connectorid;
    }

    public void setConnectorid(Integer connectorid) {
        this.connectorid = connectorid;
    }

    public String getConnectorname() {
        return connectorname;
    }

    public void setConnectorname(String connectorname) {
        this.connectorname = connectorname == null ? null : connectorname.trim();
    }

    public String getConnectorpassword() {
        return connectorpassword;
    }

    public void setConnectorpassword(String connectorpassword) {
        this.connectorpassword = connectorpassword == null ? null : connectorpassword.trim();
    }

    public String getConnectorphone() {
        return connectorphone;
    }

    public void setConnectorphone(String connectorphone) {
        this.connectorphone = connectorphone == null ? null : connectorphone.trim();
    }

    public String getConnectoremail() {
        return connectoremail;
    }

    public void setConnectoremail(String connectoremail) {
        this.connectoremail = connectoremail == null ? null : connectoremail.trim();
    }

    public Integer getHubid() {
        return hubid;
    }

    public void setHubid(Integer hubid) {
        this.hubid = hubid;
    }
}
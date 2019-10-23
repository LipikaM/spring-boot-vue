package com.lipika.api.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class TransactionGet {

    @JsonProperty(value = "userId")
    private UUID userId;

    @JsonProperty(value = "externalCode")
    private String externalCode;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(final UUID userId) {
        this.userId = userId;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(final String externalCode) {
        this.externalCode = externalCode;
    }
}

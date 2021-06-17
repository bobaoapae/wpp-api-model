package br.com.zapia.wpp.api.model.payloads;

public class StatsResponse {

    private long memoryAvailable;
    private long memoryTotal;

    public long getMemoryAvailable() {
        return memoryAvailable;
    }

    public void setMemoryAvailable(long memoryAvailable) {
        this.memoryAvailable = memoryAvailable;
    }

    public long getMemoryTotal() {
        return memoryTotal;
    }

    public void setMemoryTotal(long memoryTotal) {
        this.memoryTotal = memoryTotal;
    }
}

package br.com.zapia.wpp.api.model.payloads;


public class WebSocketResponseFrame extends WebSocketResponse {

    private int frameId;
    private int qtdFrames;
    private String compressionAlgorithm;

    public WebSocketResponseFrame() {
    }

    public WebSocketResponseFrame(int status) {
        super(status);
    }

    public WebSocketResponseFrame(int status, Object response) {
        super(status, response);
    }

    public int getFrameId() {
        return frameId;
    }

    public void setFrameId(int frameId) {
        this.frameId = frameId;
    }

    public int getQtdFrames() {
        return qtdFrames;
    }

    public void setQtdFrames(int qtdFrames) {
        this.qtdFrames = qtdFrames;
    }

    public String getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    public void setCompressionAlgorithm(String compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
    }
}

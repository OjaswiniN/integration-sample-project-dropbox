import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class DropboxTeamInfo {
    private static final String ACCESS_TOKEN = "sl.u.AGGnm7AOz0u-c5djEcalX_fsZTNxOaBBrj-LRlno69LZPLtjvEZA9kMdiunbf_uV0qfXhi3RRWvSki9bQpeRueLRNCiiRkdMbYACnDZLVRtn_Qo1vcxr4eK0z2l2bceupplfUY-Eh9tEP56nsLU5GyFNtEKVsAb0-69DJZJGG796XreCvpfGQuPfwIsW2GnTUXmnO8_Z4FL-GQfdxh4bBVt2XsQBCqAhdileRI36mNKdWKzJsDFuWNE1SR840ZSQKRN_aPsBzG_etIN7IxiKczsWRgs0CbEYlG2CYAwhVZDpkXEuTsbYTarIs2dxFd3jMq_W8IDGKMRgzNMPOxSuLAgmUpchYXJlBAtKv2Ovd9esU25eKR8XCJq7EVPgImuRM3CHu-NcWTJJKy7_voFGVX_JYP9tD3hNpus24tgtscB0mQ0zsPdpilR4lRcjyQHic5M7g_mxFS6hJ-IF2DDTOiXgbXanEdK9NI0qU_LudbY0qcxu7yQ34kgCoPk0KtLCME0nYWUNv64bJohsll0NpXsJTI19WQuVf-y9Z14PIWIfQPtUc4IDYpkr-wDeP46A1a2b7qbPAMNBCOBUvVPHmSm4O6oNVsZEDBmCXEwIQSDLFTZMLAIf8GeiIHHuSG_-ghK_RLtnMn2CGY-SpMPNuFMrDPTk6inrdZe6xO90OSTqMDQJchpNQz1yvxo9P5sVDx3uigrKXrcGnWY3v6CUQHOEvgrevGkK5obsPUo0q0Nk8d4HwVWCFaKf8hhdeWvb8TltnWh3o31FZCbHApWBhSqgbfLVedSQX4H6aCHY3QkemEkQNI5v_t1WTUwNtXcIKoucDTz2TEr0CilHXwMt60LCh2D6h1IjSdaBGkkoXtFbeWu0FCTJ6OQjtF-eWRh04qaExjGZ-Cnsrb6XFbDo2YaSe9KB-B94PLkxK76mzx-PZmaLnk7epMlaUSpscio9eNaq03Dq0aF3FZLKBESmQwrOSEOh6pxAUzG_x84SjlUCpXTTTaJ9q3yNQGZs-4FLsYipJQ7xIdMW0Kh6Gvodsane-eF30QZ43plH45kUG5GAZ42SRhyuk3zBZVqBbZtlEj0JPWYjHw0bnhO8kncdcpvtl3fMwlsTmd5PxISZYC3qFjvIUzJOTo8acGNR23iE_fA";


    public static void main(String[] args) {
        try {
            String response = callDropboxTeamInfo();
            System.out.println("Dropbox Team Info API Response");
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String callDropboxTeamInfo() throws Exception {
        String endpoint = "https://api.dropboxapi.com/2/team/members/list";

        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");
        conn.setDoOutput(true);

        conn.setRequestProperty("Authorization", "Bearer " + ACCESS_TOKEN);
        conn.setRequestProperty("Content-Type", "application/json");

        OutputStream os = conn.getOutputStream();
        os.write("{}".getBytes());
        os.flush();
        os.close();

        int responseCode = conn.getResponseCode();
        InputStream is = (responseCode == 200) ? conn.getInputStream() : conn.getErrorStream();

        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }
}

## Dropbox Business API Integration - CloudEagle Project

### Project Overview
This project demonstrates the integration of Dropbox Business APIs into the CloudEagle platform. The goals are:

1. Identify and document key Dropbox Business APIs.
2. Test these APIs using Postman.
3. Implement authentication (OAuth 2.0) and make one API call using Java.
4. Share API responses and Postman screenshots for documentation.

---

## APIs Implemented
| API | Endpoint | Method | Description |
|-----|----------|--------|-------------|
| List All Users | `/2/team/members/list` | POST | Get list of all team members |

## Sample Output

```json
{
  "members": [
    {
      "profile": {
        "team_member_id": "dbmid:AAArC19Gntur5MuPQ-PLNqIrUQsdMHcQLF4",
        "account_id": "dbid:AACeq2Kmvow8F9-LtiP3xsS1FR3SLvqiUA4",
        "email": "nandwanaojaswini@gmail.com",
        "email_verified": true,
        "status": {".tag": "active"},
        "name": {
          "given_name": "ojaswini",
          "surname": "nandwana",
          "familiar_name": "ojaswini",
          "display_name": "ojaswini nandwana",
          "abbreviated_name": "ON"
        },
        "membership_type": {".tag": "full"},
        "joined_on": "2025-11-16T06:13:53Z",
        "groups": ["g:26ce3bbf68a5f7750000000000000003"],
        "member_folder_id": "6280164400",
        "root_folder_id": "13294392321"
      },
      "role": {".tag": "team_admin"}
    }
  ],
  "cursor": "AAHtweu_...",
  "has_more": false
}








```http
Authorization: Bearer <ACCESS_TOKEN>

//In the web.config file, add the connection string:

<configuration>
  <connectionStrings>
    // <add name="hunter" connectionString="Data Source=localhost;Initial Catalog=gms;Integrated   Security=True;" />
        <add name="hunter" connectionString="Data Source=localhost;Initial Catalog=gms;User ID=root;Password=root; Integrated Security=False" />

  </connectionStrings>
</configuration>




//In  ASP.NET code:

using System;
using System.Data;
using System.Data.SqlClient;
using System.Web.Configuration;

namespace Example
{
    public partial class DisplayData : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                ObtainData();
            }
        }

        private void ObtainData()
        {
            string connectionString = WebConfigurationManager.ConnectionStrings["hunter"].ConnectionString;
            string query = "SELECT * FROM student"; 

            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                SqlDataAdapter adapter = new SqlDataAdapter(query, connection);
                DataTable dataTable = new DataTable();
                adapter.Fill(dataTable);
                GridView1.DataSource = dataTable;
                GridView1.DataBind();
            }
        }
    }
}

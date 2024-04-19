import React from 'react'; // Add import statement for React
import { NavLink } from 'react-router-dom';
import { AiOutlinePlus } from 'react-icons/ai'; // Import the AiOutlinePlus icon from react-icons

const BudgetManagement = () => {
  return (
    <>
      <body>
      <div className="container">
        <div className="row">
          <div className="col">
            <h3>Budget Management</h3>
          </div>
          <div className="col">
            <NavLink to="/" className="btn btn-primary">
              <AiOutlinePlus /> Add Transactions {/* Replace the <i> element with <AiOutlinePlus /> */}
            </NavLink>
          </div>

          <form method="GET" action="{% url 'budget_home' %}" className="row" style={{ display: 'flex' }}>
      <div className="col" style={{ display: 'inline-flex', flexDirection: 'row' }}>
        <div style={{ marginRight: '20px' }}>
          <label htmlFor="category">Category:</label>
          <select id="category" name="category" className="form-control mr-2">
            <option value="" selected>All &#9660;</option>
            {/* Static options for demonstration */}
            <option>Category 1</option>
            <option>Category 2</option>
            <option>Category 3</option>
          </select>
        </div>
        <div style={{ marginRight: '10px' }}>
          <label htmlFor="fromdate">From:</label>
          <input type="date" id="fromdate" name="fromdate" className="form-control mr-2" style={{ height: '38px' }} />
        </div>
        <div>
          <label htmlFor="todate">To:</label>
          <input type="date" id="todate" name="todate" className="form-control" style={{ height: '38px' }} />
        </div>
        <button type="submit" id="filter" className="btn btn-outline-info mt-4" style={{ height: '38px' }}>
          <i className="fa fa-filter" id="filter"></i>
        </button>
      </div>
    </form>
        </div>

        <div class="row row-cols-lg-auto g-1 justify-content-md-center ">
      <div class="col-md-auto">
        <div class="card bg-primary order-card">
          <div class="card-body text-center py-1">
            <h6 class="card-title mb-2 text-white">Total Amount</h6>
            <h3 class="card-text mb-1 text-white">¥</h3>
              <p class="card-text text-white">Completed Orders</p>
          </div>
        </div>
      </div>

      <div class="col-md-auto">
        <div class="card bg-secondary order-card">
          <div class="card-body text-center py-1">
            <h6 class="card-title mb-2 text-white">Food</h6>
            <h3 class="card-text mb-1 text-white">¥ </h3>
              <p class="card-text text-white">Completed Orders</p>
          </div>
        </div>
      </div>

      <div class="col-md-auto">
        <div class="card bg-warning order-card">
          <div class="card-body text-center py-1">
            <h6 class="card-title mb-2 text-white">Personal</h6>
            <h3 class="card-text mb-1 text-white">¥ </h3>
              <p class="card-text text-white">Completed Orders</p>
          </div>
        </div>
      </div>

      <div class="col-md-auto">
        <div class="card bg-danger order-card">
          <div class="card-body text-center py-1">
            <h6 class="card-title mb-2 text-white">Utilities</h6>
            <h3 class="card-text mb-1 text-white">¥ </h3>
              <p class="card-text text-white">Completed Orders</p>
          </div>
        </div>
      </div>

      <div class="col-md-auto">
        <div class="card bg-info order-card">
          <div class="card-body text-center py-1">
            <h6 class="card-title mb-2 text-white">Health</h6>
            <h3 class="card-text mb-1 text-white">¥ </h3>
              <p class="card-text text-white">Completed Orders</p>
          </div>
        </div>
      </div>
      <div class="col-md-auto">
        <div class="card bg-success order-card">
          <div class="card-body text-center py-1">
            <h6 class="card-title mb-2 text-white">Other</h6>
            <h3 class="card-text mb-1 text-white">¥ </h3>
              <p class="card-text text-white">Completed Orders</p>
          </div>
        </div>
      </div>
    </div>
      </div>

      </body>
    </>
  );
};

export default BudgetManagement;

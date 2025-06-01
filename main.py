from flask import *
import sqlite3 as sql

app = Flask(__name__)

@app.route('/index.html', methods=['GET', 'POST'])
def index():
    db = sql.connect("users.db")
    if request.method == 'GET':
        username = request.form['name']
        password = request.form['surname']
        age = request.form['age']
        resume = request.form['resume']
        cursor = db.cursor()
        try:
            cursor.execute("create table users (name text, sur text, age text, resume text)")
            db.commit()
        except:
            print("done")
        finally:
            cursor.execute("insert into users (name, sur, age,resume) values (?, ?)", (username, password))
            db.commit()
        return render_template('index.html')

    elif request.method == 'POST':
        return render_template('index.html')
    return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)